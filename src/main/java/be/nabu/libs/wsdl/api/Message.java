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

public interface Message extends Fragment {
	public List<MessagePart> getParts();
	
	// there are a number of points where a message can be renamed (it usually isn't)
	// if that is the case, we want to link to the parent message so we can rebuild the wsdl correctly later on (if necessary)
	// note that we copy all the relevant parts (which should be all the parts?)
	public Message getParent();
}
