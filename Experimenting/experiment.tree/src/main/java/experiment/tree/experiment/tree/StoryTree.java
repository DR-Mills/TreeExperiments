package experiment.tree.experiment.tree;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("stories")
public class StoryTree {

	private SceneNode root;

	
	// getters & setters
	public SceneNode getRoot() {
		return root;
	}
	public void setRoot(SceneNode root) {
		this.root = root;
	}
	
	
}
