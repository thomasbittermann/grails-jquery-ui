import org.grails.plugins.jqueryuix.JqueryUiXConfig

def theme = JqueryUiXConfig.theme
def jqver = JqueryUiXConfig.jqueryUiVersion

modules = {
    'jquery-theme' {
        resource id:'theme', url:[plugin: 'jqueryuix', dir: "jqueryuix/themes/${theme}", file: "jquery-ui${jqver}.custom.min.css"], attrs:[media:'screen, projection']
    }

    'jquery-ui' {
        dependsOn 'jquery', 'jquery-theme'
        resource id:'js', url:[plugin: 'jqueryuix', dir:'jqueryuix', file:"jquery-ui${jqver}.custom.min.js"], nominify: true, disposition: 'head'
    }

//    'jquery-ui-dev' {
//        dependsOn 'jquery', 'jquery-theme'
//        resource id:'js', url:[plugin: 'jqueryuix', dir:'jqueryuix', file:"jquery-ui${jqver}.custom.js"]
//    }
}
