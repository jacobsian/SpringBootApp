Repo can be run from a dev container using vscode and docker.  

Follow the steps [here](https://code.visualstudio.com/docs/devcontainers/containers#_quick-start-open-a-git-repository-or-github-pr-in-an-isolated-container-volume) to clone the repo to an isolated volume that can be used for testing.

Once the container has been initialized, you can run the server using the `./gradlew bootRun` command from the console.  

Once the server starts, you can load the swagger page to test the endpoints here http://localhost:8080/swagger-ui/index.html#/