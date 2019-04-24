import { NgModule } from '@angular/core';

import { StudentSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [StudentSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [StudentSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class StudentSharedCommonModule {}
