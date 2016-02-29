package be.nabu.libs.wsdl.api;

import java.util.List;

public interface Message extends Fragment {
	public List<MessagePart> getParts();
}
