# microservice including (REGISTRY, GATEWAY) plus PostgreSQL

this is a simple project to see the architecture of microservice that has a registry service, two microservices that communicate with each other and a gateway to rout
the client request.

the client send request to gateway-service, 
gateway-service will rout the request to the order-service, 
order-service will call the payment-service 


# you can test it with postman:

url: http://localhost:8888/order/bookorder
Method: POST

requestBode as Json:

    {
        "order":{
            "id":110,
            "name":"harryPotter",
            "qty":2,
            "price":12000
        },
        "payment":{}
    }
