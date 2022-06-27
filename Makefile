package:
	@ mvn clean package -DskipTests
	
docker-image-build: package
	@ docker build -t williammian/clines-api .

run: docker-image-build
	@ docker-compose up -d

stop: 
	@ docker-compose down -v
