import org.grails.plugin.StringTrimmerEditorRegistrar

/*
 * Copyright 2012 Konstantinos Kostarellis.
 *
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
 */
class TrimmerGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Trimmer Plugin" // Headline display name of the plugin
    def author = "Konstantinos Kostarellis"
    def authorEmail = "kosta.grails@gmail.com"
    def description = '''\
Trim all String input + convert an textinput that contains only blanks into null.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/trimmer"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]
   def issueManagement = [ system: "GITHUB", url: "https://github.com/delight/grails-trimmer/issues" ]


    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/delight/grails-trimmer" ]

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
        customPropertyEditorRegistrar(StringTrimmerEditorRegistrar)
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }

    def onShutdown = { event ->
    }
}
