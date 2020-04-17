package be.nabu.libs.wsdl.api;

public interface BindingOperationMessageLayout {
	public BindingOperationMessage getBody();
	// should only have 1 part!
	public BindingOperationMessage getHeader();
}
