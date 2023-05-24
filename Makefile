build-image:
	@ docker build -f devops/Dockerfile -t grupo1backend:1 .
volume:
	@ docker volume create pg_grupo1vol_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml grupo1
rm:
	@ docker stack rm grupo1
service:
	@ docker service ls
containers:
	@ docker ps
info-volume:
	@ docker volume ls

	