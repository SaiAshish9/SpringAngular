import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';



export class HelloBean {
  constructor(public message: string) {}
}


@Injectable({
  providedIn: 'root',
})
export class WelcomeDataService {
  baseUrl = 'http://localhost:8080/';
  constructor(private http: HttpClient) {}

  executeHelloBeanService() {
    return this.http.get<HelloBean>(this.baseUrl +'helloBean');
  }

  executeHelloBeanServiceWithVariable(name) {
    return this.http.get<HelloBean>(`${this.baseUrl}/helloBean/${name}`);
  }
}
