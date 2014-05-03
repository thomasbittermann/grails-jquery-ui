class JqueryUiXGrailsPlugin {
    // the plugin version
    def version = "1.10.4"

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
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
