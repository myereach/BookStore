package com.ereach

class Book {
	String name
	String description
	Author author
	String sn
	String getDisplayString() { return name+" "+sn }
    static constraints = {
    }
}
