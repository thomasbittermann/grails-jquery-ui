import org.grails.plugins.jqueryuix.JqueryUiXConfig

def theme = JqueryUiXConfig.theme
def jqver = JqueryUiXConfig.jqueryUiVersion ?: '1.10.4.custom.min'

modules = {
    'jquery-theme' {
        resource id:'theme', url:[plugin: 'jqueryuix', dir: "jqueryuix/themes/${theme}", file: "jquery-ui-${jqver}.css"], attrs:[media:'screen, projection']
    }

    'jquery-ui' {
        dependsOn 'jquery, jquery-theme'
        resource id:'js', url:[plugin: 'jqueryuix', dir:'jqueryuix', file:"jquery-ui-${jqver}.js"], nominify: true, disposition: 'head'
    }

    'jqdt' {
      dependsOn 'jquery-ui'
      resource id: 'js', url:[plugin: 'jqueryuix', dir:'jqdt', file:"jquery.dataTables.min.js"], nominify: true, disposition: 'head'
      resource id: 'css', url:[plugin: 'jqueryuix', dir:'css', file:"jqdt.css"], attrs:[media:'screen, projection']
    }
//    'jquery-ui-dev' {
//        dependsOn 'jquery', 'jquery-theme'
//        resource id:'js', url:[plugin: 'jqueryuix', dir:'jqueryuix', file:"jquery-ui${jqver}.custom.js"]
//    }
}
