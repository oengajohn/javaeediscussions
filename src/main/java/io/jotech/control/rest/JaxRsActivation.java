package io.jotech.control.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;

@OpenAPIDefinition(
        info = @Info(
                title = "the title",
                version = "0.0",
                description = "My API",
                license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0"),
                contact = @Contact(url = "https://mail.google.com/", name = "Jotech", email = "jotech@gmail.com")
        ),

        servers = {
                @Server(
                        description = "server 1",
                        url = "http://localhost:8080/javaeediscussions",
                        variables = {
                                @ServerVariable(name = "var1", description = "var 1", defaultValue = "1", allowableValues = {"1", "2"}),
                                @ServerVariable(name = "var2", description = "var 2", defaultValue = "1", allowableValues = {"1", "2"})
                        })
        }
)
@ApplicationPath("/api")
public class JaxRsActivation  extends Application {

}
