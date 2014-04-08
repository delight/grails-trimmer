Trimmer Plugin - Trim all inputs and turn inputs that contains only blanks into null.
====
#### As of grails >= 2.3 and later this plugin is not needed any longer because the default behaviour has changed to exactly what this plugin was achieving.



This plugin applies trimming to all ```<g:textField />``` and ```<input type="text" />``` fields of the application.

Caveat
---
There is no way (yet) to disable this behavior for a given given input field.
Good thing I can't think of a possible input were leading or trailing spaces would be of valuable information.
If there are ideas of how to make this a configurable behavior (be able to turn trimming of for certain fields), I'm more then interested.

Credit
---
This plugin is based on [GRAILS-6901](http://jira.grails.org/browse/GRAILS-6901) so the credits go to Göran Ehrsson.
