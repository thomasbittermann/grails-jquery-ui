class JqueryUiGrailsPlugin {
    // @todo This MUST be updated when you update the version of jquery ui
    static JQUERYUI_VERSION = "1.10.3"

    // Put in here the minor revision of this plugin, appended to the JQUERY UI version automatically to
    // make plugin release version
    static PLUGIN_MINOR_REVISION = ""

    // the plugin version
    // NOTE: this does not compile correctly under Grails 2.0, use 1.3.7
    def version = JQUERYUI_VERSION + (PLUGIN_MINOR_REVISION ? '.' + PLUGIN_MINOR_REVISION : '')

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [jquery:'1.6 > *']
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author      = "Thomas Bittermann"
    def authorEmail = "thomas@cobonet.de"
    def title       = "jQuery UI Resources & Extensions"
    def description = '''based on Marc Palmers work ... simply supplies jQuery UI resources, depends on jQuery plugin. Use this plugin to avoid resource duplication and conflicts.'''

    def scm = [ url: 'https://github.com/thomasbittermann/grails-jquery-ui.git']
}
