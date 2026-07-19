FROM python:3.10-alpine

COPY ./requirements.txt .

RUN pip install -r ./requirements.txt

COPY ./src /src

# telling docker which command to run when container starts
# in our case it's python and the app.py file
CMD python /src/app.py

# docker run -p 8080:5000 python-app:v1 - create container command