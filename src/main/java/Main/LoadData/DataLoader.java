package Main.LoadData;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import Main.Models.Post;
import Main.Models.User;
import Main.Repositories.UserRepository;


@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private	UserRepository userRepository;
	
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
			User user1 = new User();
			Post post1 = new Post();
			post1.setBody("Este es un día hermoso");
			
			Post post2 = new Post();
			post2.setBody("Esta es una noche espléndida");
			
			user1.setName("Pepe");
			user1.setPosts(Arrays.asList(post1,post2));
			
	        userRepository.save(user1);
	    }

}
