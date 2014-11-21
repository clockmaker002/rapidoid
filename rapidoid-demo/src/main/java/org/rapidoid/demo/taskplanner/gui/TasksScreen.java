package org.rapidoid.demo.taskplanner.gui;

/*
 * #%L
 * rapidoid-demo
 * %%
 * Copyright (C) 2014 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.rapidoid.annotation.Session;
import org.rapidoid.demo.taskplanner.model.Task;
import org.rapidoid.html.Tag;
import org.rapidoid.html.tag.H1Tag;
import org.rapidoid.model.Items;

public class TasksScreen extends GUI {

	@Session
	private Items tasks = all(Task.class);

	public String title = "My Tasks";

	public Object content() {

		H1Tag caption = h1("Manage tasks");

		Tag<?> table = grid(tasks, 0, "id", "title", "priority");

		return arr(caption, rowFull(table));
	}

}
