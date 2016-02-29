package be.nabu.libs.wsdl.api;

public interface ServicePort extends Fragment {
	public Binding getBinding();
	public String getEndpoint();
}
