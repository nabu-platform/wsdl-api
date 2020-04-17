package be.nabu.libs.wsdl.api;

import java.util.List;

public interface BindingOperation extends Fragment {
	public Operation getOperation();
	public String getSoapAction();
	public Style getStyle();
	/**
	 * The use can theoretically differ between input and output but let's not go that far...
	 */
	public Use getUse();
	
	public BindingOperationMessageLayout getInputPartLayout();
	public BindingOperationMessageLayout getOutputPartLayout();
	// you can (in theory) rename the faults
	// not sure if anyone ever does though...
	public List<BindingOperationMessage> getFaults();
}
