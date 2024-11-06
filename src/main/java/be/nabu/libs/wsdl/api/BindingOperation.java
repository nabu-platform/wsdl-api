/*
* Copyright (C) 2016 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

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
