grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir	= 'target/test-reports'

grails.project.dependency.resolution = {
  inherits 'global'

   log 'warn'

   repositories {
       inherits true // Whether to inherit repository definitions from plugins

       grailsPlugins()
       grailsHome()
       grailsCentral()

       mavenLocal()
       mavenCentral()
   }

  dependencies {}

  plugins {
    build(':release:2.2.1', ':rest-client-builder:1.0.3') { export = false }
    runtime(':resources:1.1.6') { export = true }
    runtime(':jquery:1.10.0') { export = true }
  }
}
