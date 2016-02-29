package be.nabu.libs.wsdl.api;

public interface BindingOperation extends Fragment {
	public Operation getOperation();
	public String getSoapAction();
	public Style getStyle();
	/**
	 * The use can theoretically differ between input and output but let's not go that far...
	 */
	public Use getUse();
}
