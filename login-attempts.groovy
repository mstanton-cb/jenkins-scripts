println org.kohsuke.stapler.Stapler.getCurrentRequest().getRemoteAddr();
import hudson.XmlFile
import jenkins.security.SecurityListener
import java.util.logging.Logger
SecurityListener myListener = new jenkins.security.SecurityListener() {
    private static final Logger LOGGER = Logger.getLogger(SecurityListener.class.getName());
    @Override
    void loggedIn(String username) {
        LOGGER.fine("Login failure for: " + username + " from: " + org.kohsuke.stapler.Stapler.getCurrentRequest().getRemoteAddr());
    }
}
SecurityListener.all().add(myListener)
println "Added '${myListener}'"

