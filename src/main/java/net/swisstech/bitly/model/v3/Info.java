/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.swisstech.bitly.model.v3;

import java.util.List;

import org.joda.time.DateTime;

public class Info {

	public List<Element> info;

	public static class Element {

		public DateTime created_at;

		public String created_by;

		public String global_hash;

		public String title;

		public String user_hash;

		@Override
		public String toString() {
			return String.format("Element { created_at=%s created_by=%s global_hash=%s title=%s user_hash=%s }", created_at, created_by, global_hash,
					title, user_hash);
		}
	}

	@Override
	public String toString() {
		return String.format("Info { info=%s }", info);
	}
}
