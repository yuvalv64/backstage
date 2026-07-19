from flask import jsonify
from flask import Flask
import datetime 
import socket

app = Flask(__name__)

@app.route('/api/v1/details')
def info():
    return jsonify({
        "service":"backstage ",
        "version":"2.0.0",
        "time": datetime.datetime.now().isoformat(),
        "hostname": socket.gethostname(),
        "deployed_on": "K8S",
        "message":"Welcome to the backstage service!"
    })

@app.route('/health')
def health():
    return jsonify({
        "status":"healthy"
    })

if __name__ == '__main__':
    app.run(host="0.0.0.0")