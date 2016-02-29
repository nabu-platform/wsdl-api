package be.nabu.libs.wsdl.api;

import java.util.List;

public interface Service extends Fragment {
	public List<ServicePort> getPorts();
}
