public class Main {
  public static void main(String[] args) {

      ConfigurationManager configManager = ConfigurationManager.getInstance();

      String databaseUrl = configManager.getProperty("database.url");
      String databaseUser = configManager.getProperty("database.user");
      String databasePassword = configManager.getProperty("database.password");

  }
}