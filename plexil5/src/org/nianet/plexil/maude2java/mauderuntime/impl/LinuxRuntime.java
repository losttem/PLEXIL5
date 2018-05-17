package org.nianet.plexil.maude2java.mauderuntime.impl;

import org.nianet.plexil.maude2java.mauderuntime.OSShellRuntimeProperties;

/**
 * 
 * @author Hector Fabio Cadavid Rengifo
 *
 */
public class LinuxRuntime extends OSShellRuntimeProperties {

	@Override
	public String getAvailableOSShellCommand() {
		return "bash -c";
	}

	@Override
	public String getSupportedOSName() {
		return "Linux";
	}

	
}
