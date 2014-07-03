layout 'layouts/main.groovy',
        menu: menu,
        category: category,
        pageTitle: 'The Groovy programming language - FAQ - Frequently Asked Questions',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            ul(class: 'nav-sidebar') {
                                li {
                                    a(href: 'learn.html', 'Learn')
                                }
                                li {
                                    a(href: 'learn.html#books', 'Books')
                                }
                                li {
                                    a(href: 'documentation.html', 'Documentation')
                                }
                                docSections.each { section ->
                                    li { a(href: "documentation.html#${section.anchor}", section.name) }
                                }
                                li(class: 'active') {
                                    a(href: 'faq.html') { strong('FAQ') }
                                }
                            }
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            h1 'FAQ - Frequently Asked Questions'
                            hr(class: 'divider')
                            article {
                                h2 'Is Groovy an Open Source project?'
                                p {
                                    yield 'Yes, Groovy is an Open Source programming language project, licensed under the '
                                    a(href: 'http://www.apache.org/licenses/LICENSE-2.0', 'Apache License v2')
                                    yield '. You can see the license header in all the source files of the project, as well as a '
                                    a(href: 'https://github.com/groovy/groovy-core/blob/master/LICENSE.txt', 'license file')
                                    yield ' at the root of the project'
                                }

                                h2 'What are the differences between Groovy and Java?'
                                p {
                                    yield 'Learn more about the '
                                    a(href: 'differences.html', 'differences between Groovy and Java')
                                    yield '.'
                                }
                            }
                        }
                    }
                }
            }
        }