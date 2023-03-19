# 

## Model
www.msaez.io/#/storming/deliveryExample

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- store
- rider
- customer


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/storeChoices id="id" storeId="storeId" storeName="storeName" 
 http :8088/menuChoices id="id" storeId="storeId" storeName="storeName" menuId="menuId" menuName="menuName" price="price" customerId="customerId" customerName="customerName" customerAddress="customerAddress" 
```
- store
```
 http :8088/stores id="id" customerId="customerId" customerAddress="customerAddress" status="status" qty="qty" customerName="customerName" payDate="payDate" 
```
- rider
```
 http :8088/deliveries id="id" customerAddress="customerAddress" state="state" customerName="customerName" customerId="customerId" storeId="storeId" menuId="menuId" pickDT="pickDT" finishCook="finishCook" 
```
- customer
```
 http :8088/pays id="id" state="state" oderId="oderId" price="price" customerId="customerId" customerName="customerName" customerAddress="customerAddress" payDate="payDate" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

