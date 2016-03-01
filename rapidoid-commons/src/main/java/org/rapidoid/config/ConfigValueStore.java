package org.rapidoid.config;

/*
 * #%L
 * rapidoid-commons
 * %%
 * Copyright (C) 2014 - 2016 Nikolche Mihajlovski and contributors
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

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.u.U;
import org.rapidoid.value.ValueStore;

@Authors("Nikolche Mihajlovski")
@Since("5.1.0")
public class ConfigValueStore<T> implements ValueStore<T> {

	private final Config config;

	private final String key;

	public ConfigValueStore(Config config, String key) {
		this.config = config;
		this.key = key;
	}

	@Override
	public T get() {
		return (T) config.get(key);
	}

	@Override
	public void set(T value) {
		config.set(key, value);
	}

	@Override
	public String desc() {
		return U.join(".", config.keys()) + "." + key;
	}

}