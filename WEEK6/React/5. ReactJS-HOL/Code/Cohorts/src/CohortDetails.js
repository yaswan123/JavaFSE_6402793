import styles from './CohortDetails.module.css';
function CohortDetails(props) {
    return (
        <div>
            <div className={styles.box}>
            {props.cohort.currentStatus === 'Ongoing' ? (
                <>
                    <h3 style={{color:'blue'}}>
                    {props.cohort.cohortCode} -
                    <span>{props.cohort.technology}</span>
                </h3>
                </>
            ):(
                 <>
                    <h3 style={{color:'green'}}>
                    {props.cohort.cohortCode} -
                    <span>{props.cohort.technology}</span>
                </h3>
                </>
            ) }
            
            <dl>
                <dt>Started On</dt>
                <dd>{props.cohort.startDate}</dd>
                <dt>Current Status</dt>
                <dd>{props.cohort.currentStatus}</dd>
                <dt>Coach</dt>
                <dd>{props.cohort.coachName}</dd>
                <dt>Trainer</dt>
                <dd>{props.cohort.trainerName}</dd>
            </dl>
            </div>
        </div>

        
    );
}
export default CohortDetails;