package com.chjavascript.core;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import javax.script.ScriptEngine;

/**
 *
 */
public class CHJavascript extends AbstractExtension {

	public Version getVersion() {
		return new SimpleVersion("1.0.0");
	}
}
