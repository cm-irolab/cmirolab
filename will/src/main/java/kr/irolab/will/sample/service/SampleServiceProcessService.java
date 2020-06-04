package kr.irolab.will.sample.service;

import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleServiceProcessService {

	final List<Post> posts = new ArrayList<>();

	@PostConstruct
	public void init() {
		LocalDateTime now = LocalDateTime.now();
		String createAt = now.format(DateTimeFormatter.ISO_DATE_TIME);

		Post p1 = new Post();
		p1.setPostNo(posts.size());
		p1.setPostTitle("타이틀-1");
		p1.setPostCatname("제목-1");
		p1.setPostText("내용-1");
		p1.setPostFile("파일-1");
		p1.setPostCreateDt(createAt);

		posts.add(p1);
	}

	public List<Post> gets() {
		return posts;
	}

	public Post post(Post post) {
		if (post.getPostNo() != null) {
			log.error("유효하지 않은 POST: {}", post);
			throw new InvalidParameterException("PostNo 정보가 있습니다.");
		}

		LocalDateTime now = LocalDateTime.now();
		String createAt = now.format(DateTimeFormatter.ISO_DATE_TIME);
		post.setPostNo(posts.size());
		post.setPostCreateDt(createAt);
		posts.add(post);

		return post;
	}

}
