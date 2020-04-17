package be.nabu.libs.wsdl.api;

import java.util.List;

public interface Message extends Fragment {
	public List<MessagePart> getParts();
	
	// there are a number of points where a message can be renamed (it usually isn't)
	// if that is the case, we want to link to the parent message so we can rebuild the wsdl correctly later on (if necessary)
	// note that we copy all the relevant parts (which should be all the parts?)
	public Message getParent();
}
