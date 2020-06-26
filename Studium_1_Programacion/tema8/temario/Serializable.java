package temario;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public interface Serializable {
	public void writeExternal(ObjectOutput out) throws IOException; 
	public void readExternal(ObjectInput in) throws IOException, 
	ClassNotFoundException;
}
