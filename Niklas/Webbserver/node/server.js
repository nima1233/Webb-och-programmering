const { createServer } = require("http");
const { createReadStream } = require("fs");
const { decode } = require("querystring");

const sendFile = (response, status, type, filePath) => {
    response.writeHead(status, { "Content-Type": type });
    createReadStream(filePath).pipe(response);
};

createServer((request, response) => {
  if (request.method === "POST") {
    let body = "";
    request.on("data", data => {
      body += data;
    });
  }

  switch (request.url) {
      case "/":  
        return sendFile(response, 200, "text/html", "./testis.html");
      case "/bild.jpg":
        return sendFile(response, 200, "image/jpg", "./bild.jpg");
      case "/contact":
        return sendFile(response, 200, "text/html", "./contact.html");
      default:
        return sendFile(response, 200, "text/html", "./404.html");
  }
}).listen(3000);

console.log("Nimas sida port 3000");