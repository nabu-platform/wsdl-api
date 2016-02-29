package be.nabu.libs.wsdl.api;

import java.util.List;

public interface Operation extends Fragment {
	public Message getInput();
	public Message getOutput();
	public List<Message> getFaults();
}
