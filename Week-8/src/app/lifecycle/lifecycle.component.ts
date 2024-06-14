import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-lifecycle',
  templateUrl: './lifecycle.component.html',
  styleUrls: ['./lifecycle.component.css']
})
export class LifecycleComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterViewChecked, AfterContentInit, AfterContentChecked, AfterViewInit, OnDestroy{

  @Input() bindable =1000;
  private log (hook:string){
    console.log(hook);
  }

  ngOnChanges(){
      this.log("onChange");
  }

  ngOnInit() {
      this.log("OnInit");
  }

  ngAfterContentChecked() {
      this.log("AfterContentChecked");
  }

  ngAfterContentInit() {
      this.log("ngAfterContentInit");
  }

  ngDoCheck(): void {
      this.log("ngDoCheck");
  }

  ngAfterViewChecked(): void {
      this.log("ngAfterViewChecked");
  }

  ngAfterViewInit(): void {
      this.log("ngAfterViewInit");
  }
  ngOnDestroy(): void {
      this.log("ngOnDestroy");
  }
}
