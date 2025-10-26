def format_duration(seconds):
    HOUR_IN_SECONDS = 60 * 60
    DAY_IN_SECONDS = HOUR_IN_SECONDS * 24
    YEAR_IN_SECONDS = DAY_IN_SECONDS * 365

    years = seconds / YEAR_IN_SECONDS
    rem_seconds_after_year = seconds % YEAR_IN_SECONDS
    rem_days_after_year = rem_seconds_after_year / DAY_IN_SECONDS
    rem_seconds_after_days = rem_days_after_year % 