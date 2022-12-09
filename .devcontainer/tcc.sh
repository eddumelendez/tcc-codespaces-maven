suffix=$([[ $(uname -m) == "aarch64" ]] && echo "arm64" || echo "x86-64")
  
# fetch the latest TCC agent version and make it executable
curl -L -o agent https://app.testcontainers.cloud/download/testcontainers-cloud-agent_linux_$suffix
chmod +x agent
