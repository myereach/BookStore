import com.ereach.Author

class BootStrap {

    def init = { servletContext ->
		new Author(firstName:'Mark', lastName:'Chang').save();
    }
    def destroy = {
    }
}
