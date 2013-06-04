package org.grails.plugins.jqueryuix

import grails.util.Holders

class JqueryUiXConfig {

	static ConfigObject getConfig() {
		Holders.grailsApplication.config.grails.plugin.jqueryuix
	}

	static String getLocale() {
		getConfig().locale ?: "de"
	}

	static String getTheme() {
		getConfig().theme ?: "flick"
	}

	static String getJqueryVersion() {
		getConfig().jquery.version ? "-${getConfig().jquery.version}": ""
	}

	static String getJqueryUiVersion() {
		getConfig().jqueryui.version ? "-${getConfig().jqueryui.version}": ""
	}

}
