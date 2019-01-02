# spring-data-mong-example
Sample repository for using Spring boot with mongodb. This is completely annotation based configuration. This project contains a simple crud flow for a "Product" entity.

# To run this
- Update the application.properties (MongoDB connection details).
- The Swagger UI (Api documentation and to try out the service) can be accessed with http://localhost:8080/deepag/spring-data-mongo/swagger-ui.html
- "product-controller" API in the swagger-ui can be used for testing this out.
- This service will create a collection "myproduct" in the configured mongoDB. The name of the collection can be updated in the Product.java @Document annotation.
