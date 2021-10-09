import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContenidoMiembroComponent } from './contenido-miembro.component';

describe('ContenidoMiembroComponent', () => {
  let component: ContenidoMiembroComponent;
  let fixture: ComponentFixture<ContenidoMiembroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContenidoMiembroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContenidoMiembroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
