package com.ereach

class Author {
	String firstName
	String lastName
	Book book
	String getDisplayString() { return lastName+" "+firstName }
    static constraints = {
		book(nullable: true)
    }
}
