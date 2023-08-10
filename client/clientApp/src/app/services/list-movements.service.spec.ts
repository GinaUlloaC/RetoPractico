import { TestBed } from '@angular/core/testing';

import { ListMovementsService } from './list-movements.service';

describe('ListMovementsService', () => {
  let service: ListMovementsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListMovementsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
