package com.coderzplaza.grails.jqueryuix

class JqueryUiXTagLib {

    static namespace = "jquix"

    static writeAttrs( attrs, output) {
        // Output any remaining user-specified attributes
        attrs.each { k, v ->
            output << k
            output << '="'
            output << v.encodeAsHTML()
            output << '" '
        }
    }

    static LINK_WRITERS = [
        js: { url, constants, attrs ->
            def o = new StringBuilder()
            o << "<script src=\"${url.encodeAsHTML()}\" "

            // Output info from the mappings
            writeAttrs(constants, o)
            writeAttrs(attrs, o)

            o << '></script>'
            return o
        },

        link: { url, constants, attrs ->
            def o = new StringBuilder()
            o << "<link href=\"${url.encodeAsHTML()}\" "

            // Output info from the mappings
            writeAttrs(constants, o)
            writeAttrs(attrs, o)

            o << '/>'
            return o
        }
    ]

    static RESOURCE_MAPPINGS = [
        css:[type:"text/css", rel:'stylesheet'],
        rss:[type:'application/rss+xml', rel:'alternate'],
        atom:[type:'application/atom+xml', rel:'alternate'],
        favicon:[type:'image/x-icon', rel:'shortcut icon'],
        appleicon:[type:'image/x-icon', rel:'apple-touch-icon'],
        js:[writer:'js', type:'text/javascript']
    ]

    static CDN_URLS = [
        googlecode: [
            css:{jqver, theme, min -> "http://ajax.googleapis.com/ajax/libs/jqueryui/$jqver/themes/$theme/jquery-ui.css"},
            js:{jqver, theme, min -> "http://ajax.googleapis.com/ajax/libs/jqueryui/$jqver/jquery-ui.${min ? 'min.js' : 'js'}"}
        ]
    ]


    def autocomplete = {
    }

}
