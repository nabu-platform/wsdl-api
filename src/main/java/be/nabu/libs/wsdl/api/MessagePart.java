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

import be.nabu.libs.types.api.Element;
import be.nabu.libs.types.api.Type;

/**
 * The "name" of the message part allows you to reference it
 * It is only really used in RPC though, in document style we use the name of the element
 */
public interface MessagePart extends Fragment {
	/**
	 * In document style, we define an element
	 */
	public Element<?> getElement();
	/**
	 * In RPC style we define a type
	 */
	public Type getType();
}
