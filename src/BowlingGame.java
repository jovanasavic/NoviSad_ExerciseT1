import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:20.52
// Student ID: IT18-2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
		this.bonus = bonus;
		this.frames = frames;
		
	}
	
	// adds a frame to the game
	
	public void addFrame(Frame frame) throws BowlingException{
		frame = new Frame();
		if (frames.size() < 10)
			frames.add(frame);
		else 
			throw new BowlingException();
			
		//to be implemented
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		int bonus=0;
		
		
		
		//to be implemented
		
	}
	
	// Returns the game score
	public int score(){
	
	
		
			
		//to be implemented: should return game score 
		return 0;
	}
}
